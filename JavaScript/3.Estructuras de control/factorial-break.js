let i = 1;
let factorial = 1;

while(true){
    if(i>10){
        break;
    }
    factorial = factorial * i;
    i++;
    
}

console.log("El factorial de 10 es: " + factorial)