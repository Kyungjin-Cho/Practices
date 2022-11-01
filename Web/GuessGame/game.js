const form = document.getElementById("gameForm");

let maximumNum = document.getElementById("maxNum");
let ansNum = document.getElementById("ansNum");

let resultArea = document.getElementById("resultArea");
let descArea = document.getElementById("descArea");

function play() {
  let answerNum = ansNum.value;
  let maxNum = maximumNum.value;
  let randNum = Math.ceil(Math.random() * maxNum);

  resultArea.innerText = `You chose: ${answerNum}, the machine chose: ${randNum}`;
  answerNum = parseInt(answerNum);
  if (answerNum === randNum) {
    descArea.innerText = `You won!`;
  } else {
    descArea.innerText = `You lost!`;
  }
}

function handleSubmit(event) {
  event.preventDefault();
  play();
}

form.addEventListener("submit", handleSubmit);

