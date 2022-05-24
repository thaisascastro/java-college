function multiplicationTable() {
    let exit = document.getElementById('saida')
    let n = Number(document.getElementById('fnum').value)

    exit.innerHTML = `<h2>Tabuada de ${n}</h2>`
    let v = 1
    while (c <= 10) {
        exit.innerHTML += `${n} x ${v} = <strong>${n * v}</strong><br>`
        c ++
    }
}