//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

let id = parseInt(gets());

//TODO: Print no console se a semente deve ser plantada ou se o buraco deve
//avançar ou retroceder X metros

let metros;

if (id == 10) {
    console.log("Plantar!");
} else if (id > 10) {
    metros = id - 10;
    console.log(`O buraco deve retroceder ${metros} metros`);
} else if (id < 10) {
    metros = (id - 10) * -1;
    console.log(`O buraco deve avançar ${metros} metros`);
}