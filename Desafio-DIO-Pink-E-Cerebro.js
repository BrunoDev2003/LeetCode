// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.

// TODO: Retorne a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista
let n = gets();
let numeros = gets().split(' ');
let multiplos = 0;

for (let i =0; i <= 3; i++) {
    numeros.forEach(numero => {
        if(numero  % (i + 2) == 0      ) {
            multiplos++;
        }
    })
   console.log(`${multiplos}  Multiplo(s) de ${i + 2}`)
    multiplos = 0;
}
