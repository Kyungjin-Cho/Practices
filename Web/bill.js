
function handleSubmit(event) {
  alert("Your order will be ready in 40 minutes.")
  event.preventDefault();
  printDate();
  printGreeting();
  printAddress();
  printMenu();
  printSize();
  const target = document.getElementById('submit');
  target.disabled = true;
}

function submitActive() {
  const target = document.getElementById('submit');
  target.disabled = false;
  window.location.reload()
}

function printDate() {
  const date = new Date();
  const printDate = document.getElementById('printDate');
  const todayDate = String(date.getDate()).padStart(2, "0");
  const todayMonth = String(date.getMonth() + 1).padStart(2, "0");
  const todayYear = String(date.getFullYear());
  const today = document.createTextNode(`${todayDate} - ${todayMonth} - ${todayYear}`);
  printDate.appendChild(today);
}

function printGreeting() {
  const name = document.getElementById('username').value;
  const greetingName = document.getElementById('greetingName');
  const greeting = document.createTextNode(`Dear ${name}, Thank you for your order.`);
  greetingName.appendChild(greeting);
};

function printAddress() {
  const addr = document.getElementById('addr').value;
  const deliveryAddr = document.getElementById('deliveryAddr');
  const printAddr = document.createTextNode(`: ${addr}`)
  deliveryAddr.appendChild(printAddr);
};

function printMenu() {
  const burgerMenu = document.querySelector('input[type=radio][name=burgerMenu]:checked');
  const burgerMenuCell = document.getElementById('menuDesc');
  const burgerPriceCell = document.getElementById('menuRate');
  const burgerQty = Number(document.getElementById('qty').value, 10);
  const burgerQtyCell = document.getElementById('menuQty');
  const burgerTotalCell = document.getElementById('menuTotal');
  let menuRate;
  const printMenu = document.createTextNode(`${burgerMenu.value}`)
  burgerMenuCell.appendChild(printMenu);
  if (burgerMenu.value == "WOW Hamburger") {
    menuRate = 6.45;
  } else if (burgerMenu.value == "WOW Cheeseburger") {
    menuRate = 7.45;
  } else {
    menuRate = 8.45;
  }
  const printMenuRate = document.createTextNode(`${menuRate}`)
  burgerPriceCell.appendChild(printMenuRate);

  let printMenuQty = document.createTextNode(`${burgerQty}`)
  burgerQtyCell.appendChild(printMenuQty);

  let printMenuTotal = document.createTextNode(`${menuRate * burgerQty}`)
  burgerTotalCell.appendChild(printMenuTotal);

};

function printSize() {
  const burgerSize = document.getElementById("size").options[sizeOption.selectedIndex].value;
  const sizeDescCell = document.getElementById("sizeDesc");
  const sizeRateCell = document.getElementById("sizeRate");
  const burgerQty = document.getElementById('qty').value;
  const sizeQtyCell = document.getElementById('sizeQty');
  const sizeTotalCell = document.getElementById('sizeTotal');
  let sizeRate;

  if (burgerSize == "Extra-Large") {
    sizeRate = 9;
  } else if (burgerSize == "Supersize") {
    sizeRate = 17.5;
  } else {
    sizeRate = 7;
  }

  const printSizeDesc = document.createTextNode(`${burgerSize}`)
  sizeDescCell.appendChild(printSizeDesc);

  const printSizeRate = document.createTextNode(`${sizeRate}`)
  sizeRateCell.appendChild(printSizeRate);

  const printSizeQty = document.createTextNode(`${burgerQty}`)
  sizeQtyCell.appendChild(printSizeQty);

  const printSizeTotal = document.createTextNode(`${sizeRate * burgerQty}`)
  sizeTotalCell.appendChild(printSizeTotal);

};







