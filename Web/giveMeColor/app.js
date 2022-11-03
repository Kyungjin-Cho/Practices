const btn = document.getElementById("colorBtn");
const bg = document.querySelector("body")
const color = ['#E97777',
  '#DEF5E5',
  '#B9E0FF',
  '#E5EBB2',
  '#F6F6C9',
  '#B8E8FC',
  '#628E90',
  '#FF8787',
  '#FCDDB0',
  '#9ED5C5',
  '#9F8772',
  '#372948',
  '#FF8787',
  '#7D6E83',
  '#F08080'];


function changeColor() {

  let num1 = Math.floor(Math.random() * color.length);
  let num2 = Math.floor(Math.random() * color.length);
  let firstColor = color[num1];
  let secondColor = color[num2];
  console.log(firstColor)
  console.log(secondColor)

  bg.style.backgroundImage = `linear-gradient(0.25turn, ${firstColor}, ${secondColor})`;
}

btn.addEventListener("click", changeColor);