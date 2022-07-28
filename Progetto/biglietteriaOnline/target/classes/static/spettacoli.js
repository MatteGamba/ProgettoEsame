const URL_cliente = "http://localhost:8080/api/cliente/all";
const URL_biglietto = "http://localhost:8080/api/biglietto/all";
const URL_replica = "http://localhost:8080/api/replica/all";
const URL_spettacolo = "http://localhost:8080/api/spettacolo/all";
const URL_teatro = "http://localhost:8080/api/teatro/all";

let teatri = []

function checkIfTeatroIsTaken(codTeatro) {
    for(let teatro of teatri){
        if(teatro.codTeatro == codTeatro)
            return true;
    }
    return false;
}

fetch(URL_replica).then(json => json.json()).then(repliche => {
    console.log(repliche);
    const ul = document.createElement("ul");
    ul.setAttribute("class", "list-group");


    for(let replica of repliche) {
        if(!checkIfTeatroIsTaken(replica.codSpettacolo.codTeatro.codTeatro)){
            teatri.push(replica.codSpettacolo.codTeatro)
        }
    }

    console.log(teatri);

    for(let teatro of teatri){
        // $(".listaspettacoli").append(`<h3>${teatro.nome}</h3>`);
        for (let replica of repliche) {
                if(teatro.codTeatro == replica.codSpettacolo.codTeatro.codTeatro){
                $(".listaspettacoli").append(
                    `
                    <div class="col-3 my-3">
                    <div class="card border-dark">
                        <h5 class="card-header text-center">${replica.codSpettacolo.codTeatro.nome}</h5>
                        <div class="card-body">
                            <p class="card-text"> <span class="font-weight-bold">Autore: </span> ${replica.codSpettacolo.autore}</p>
                            <p class="card-text"><span class="font-weight-bold">Regista: </span> ${replica.codSpettacolo.regista}</p>
                            <p class="card-text"><span class="font-weight-bold">Prezzo: </span>${replica.codSpettacolo.prezzo}€</p>
                            <p class="card-text"><span class="font-weight-bold">Data: </span>${replica.dataReplica}</p>
                        </div>
                    </div>
                    </div>                    
                    `
                )
            }
        }
    }
});