//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const arr = gets().split(', ')
let qualFiltro = 0;

//TODO: Print no console qual filtro deve ser utilizado de acordo com as moléculas na entrada

for (let i = 0; i < arr.length; i++) {
    qualFiltro = arr[i].length;
    if (qualFiltro <= 5) {
        console.log("O filtro deve ser: Filtro Normal");
        break;
    } else if (qualFiltro > 5 && qualFiltro <= 10) {
        console.log("O filtro deve ser: Filtro Específico");
        break;
    } else if (qualFiltro > 10){
        console.log("O filtro deve ser: Filtro Duplo Específico");
        break;
    }
}