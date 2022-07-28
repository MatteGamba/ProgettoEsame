const URL_cliente = "http://localhost:8080/api/cliente/all";
const URL_biglietto = "http://localhost:8080/api/biglietto/all";
const URL_replica = "http://localhost:8080/api/replica/all";
const URL_spettacolo = "http://localhost:8080/api/spettacolo/all";
const URL_teatro = "http://localhost:8080/api/teatro/all";

let clienti = []

function checkIfClientiIsTaken(codCliente) {
    for(let cliente of clienti){
        if(cliente.codCliente == codCliente)
            return true;
    }
    return false;
}

fetch(URL_biglietto).then(json => json.json()).then(biglietti => {
    console.log(biglietti);
    const ul = document.createElement("ul");
    ul.setAttribute("class", "list-group");


    for(let biglietto of biglietti) {
        if(!checkIfClientiIsTaken(biglietto.codCliente.codCliente)){
            clienti.push(biglietto.codCliente)
        }
    }

    console.log(clienti);

    for(let cliente of clienti){
        // $(".listabiglietti").append(`<h3>${cliente.nome}</h3>`);
        for (let biglietto of biglietti) {
                if(cliente.codCliente == biglietto.codCliente.codCliente){
                $(".listabiglietti").append(
                    `
                    <div class="card col-4" style="width: 18rem;">
                    <div class="card-body">
                        <h4 class="card-title text-center">${biglietto.codOperazione}</h4>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item"><span class="font-weight-bold">Nome cliente: </span>${biglietto.codCliente.nome}</li>
                        <li class="list-group-item"><span class="font-weight-bold">Cognome cliente: </span>${biglietto.codCliente.cognome}</li>
                        <li class="list-group-item"><span class="font-weight-bold">Titolo film: </span>${biglietto.codReplica.codSpettacolo.titolo}</li>
                        <li class="list-group-item"><span class="font-weight-bold">Nome teatro: </span>${biglietto.codReplica.codSpettacolo.codTeatro.nome}</li>
                        <li class="list-group-item"><span class="font-weight-bold">Prezzo: </span>${biglietto.codReplica.codSpettacolo.prezzo}€</li>
                        <li class="list-group-item"><span class="font-weight-bold">Data: </span>${biglietto.codReplica.dataReplica}</li>
                        <li class="list-group-item"><span class="font-weight-bold">Ha pagato con: </span>${biglietto.tipoPagamento}</li>
                        <li class="list-group-item"><span class="font-weight-bold">Biglietti acquistati: </span>${biglietto.quantita}</li>


                    </ul>
                    </div>


                    
                `
                )
            }
        }
    }
});