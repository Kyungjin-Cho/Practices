function getTime() {
  const xMas = new Date("2022-12-25");
  const today = new Date();

  const diff = xMas - today;

  const days = String(Math.floor(diff / (1000 * 60 * 60 * 24))).padStart(2, "0");
  const hours = String(Math.floor((diff / (1000 * 60 * 60)) % 24)).padStart(2, "0");
  const minutes = String(Math.floor((diff / (1000 * 60)) % 60)).padStart(2, "0");
  const seconds = String(Math.floor(diff / 1000 % 60)).padStart(2, "0");

  const time = document.getElementById("time");
  time.innerText = `${days}d ${hours}h ${minutes}m ${seconds}s`;
}

getTime();
setInterval(getTime, 1000);