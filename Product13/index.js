function factorial() {
    let exit = document.getElementById('Saída')
    let n = Number(document.getElementById('fnum').value)

    exit.innerHTML += `<h2>Calculando ${n}!</h2>`
    let v = n
    let fat = 1
    while (v > 1) {
        exit.innerHTML += `${v} x `
        fat *= v 
        v --
    }
    exit.innerHTML += `1 = <strong>${fat.toLocaleString('pt-BR')}</strong>`
    
}