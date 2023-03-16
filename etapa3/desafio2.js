//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

let lista1 = gets().split(', ');
let lista2 = gets().split(', ');
let lista3 = gets().split(', ')

let arr = [lista1, lista2, lista3]
let qualFiltro = false;
let qualMolecula;
let listas = lista1.concat(lista2).concat(lista3);
let tipoFiltro = "Filtro Simples"

const moleculasProibidas = "NO2, SO2, CO, FHO".split(", ");
//TODO: Print no console qual filtro deve ser utilizado de acordo com as moléculas prejudiciais
//avaliadas no teste.

const achaMolecula = moleculasProibidas.find(molecula => listas.includes(molecula));

    

    if( achaMolecula != undefined ) {
        tipoFiltro = `Filtro Específico para a Molécula ${achaMolecula}`;
    }

    print(tipoFiltro);