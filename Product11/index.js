let strawberries = 20, apple = 32;

let strawberryPrice1 = strawberries * 2.50;
let strawberryPrice2 = strawberries * 2.20

let applePrice1 = apple * 1.80;
let applePrice2 = apple * 1.50;

console.log("Digite a quantidade de morangos [kg]:", strawberries);
console.log("Digite a quantidade de maçãs [Kg]:", apple)

console.log(`Quantidade de maçãs: ${apple}, \nQuantidade de strawberries: ${strawberries}.`)

if (strawberries > 5) {
    rightStrawberryPrice = strawberryPrice1
}

else {
    rightStrawberryPrice = strawberryPrice2
}

if (apple > 5) {
    rightApplePrice = applePrice1
}
else {
    rightApplePrice = applePrice2
}

totalPrice = rightApplePrice + rightStrawberryPrice

if (totalPrice > 25 || (apple + strawberries) > 8 ) {
    console.log("Preço final:", (totalPrice - (totalPrice * 0.1)))
}

else {
    console.log("Preço final:", totalPrice.toFixed(2))
}