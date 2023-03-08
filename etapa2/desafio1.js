//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

let amostra = gets().split(',')

//TODO: Print no console, para cada índice da lista, os parâmetros
//se a amostra está bom, aceitável ou inaceitável

for(let i = 0; i < amostra.length; i++) {
    let indicador = parseInt(amostra[i]);
    if (indicador >= 75) {
        console.log("Descartar da lista");
    } else if (indicador >= 50 && indicador <= 75) {
        console.log("Manter sob observação");
    } else {
        console.log("Isolar e iniciar protocolo de cuidados");
    }
}