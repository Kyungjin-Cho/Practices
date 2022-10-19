import { useEffect, useState } from "react";

// usd 금액을 넣으면 얼마만큼의 비트코인을 살 수 있는지

function App() {
  const [loading, setLoading] = useState(true); // default : true
  const [coins, setCoins] = useState([]); // data from API
  const [cost, setCost] = useState(1);
  const [payment, setPayment] = useState(1);
  const onChange = (event) => {
    setCost(event.target.value);
    setPayment(1);
  }
  const handleInput = (event) => {
    setPayment(event.target.value);
  } 
  useEffect(()=>{
    fetch("https://api.coinpaprika.com/v1/tickers")
      .then((response) => response.json())
      .then((json) => {
        setCoins(json); // when we get json, it will be value of setCoins
        setLoading(false); // when we finish getting coins, set loading false
      });
  },[]); // this code will run only once because there's blank / When u want to use a valuable, you need {}
  return (
  <div>
    <h1>{loading ? ":)" :`There are ${coins.length} coins right now`}</h1>
    {loading ? <strong>Loading...</strong> : <select id= "select_value" onChange={onChange}>
      <option>Select Coin!</option>
      {coins.map((coin, index) =>
      // map requires a function. Frist argument is value, next one is index
      <option 
        key={index}
        value={coin.quotes.USD.price} 
        id={coin.symbol}
        name = {coin.name} >
        {coin.name}({coin.symbol}) : ${coin.quotes.USD.price} USD
        </option>
       )}
    </select>}
    <h2>If you have the below amount,</h2>
    <div>
      $ <input type="number" value={payment} onChange={handleInput} placeholder="Please enter the amount in dollar"/> USD
    </div>
    <h2>You will get {payment/cost} items.</h2> 
  </div>);
}
export default App;
