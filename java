function calcular() {
    const p = Number(document.querySelector("#inputposicao").value); // posicao
    const v = Number(document.querySelector("#inputvelocidade").value); // velcidade
    const t = Number(document.querySelector("#inputtempo").value); // tempo
    
    const k = p * v + t //fórmula

    document.querySelector("#resultado").textContent = "Velocidade:" + k.toFixed(2) + "m/s"; // oque faz o resultado aparecer
   
}

document.addEventListener("DOMContentLoaded", () => {
    const calcularButton = document.querySelector("#calcular");
    calcularButton.addEventListener("click", calcular); // oque faz o botão calcular a fórmula
});
