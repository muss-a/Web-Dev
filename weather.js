// weather.js
// This is a simple block of code that fetches weather data using an API by OpenWeather

const getWeather = async () => {
  const response = await fetch(
    "http://api.openweathermap.org/data/2.5/weather?q=ottawa&units=metric&appid=ad27e4ef13fb31c780cf35db4c51fef9"
  );
  const weatherJSON = await response.json();
  return await weatherJSON;
};

async function showWeather() {
  let weather = await getWeather();
  let timenow = showTime();
  let weathericon =
    "<img id='weathericon' src='http://openweathermap.org/img/wn/" +
    weather["weather"][0]["icon"] +
    "@2x.png'>";

  document.getElementById("forecast").innerHTML =
    weathericon +
    "<div class ='greetingText'>" +
    timeGreeting() +
    "</div>" +
    "it's " +
    timenow +
    "in Ottawa with " +
    weather["weather"][0]["description"] +
    " and feels like " +
    Math.ceil(weather["main"]["feels_like"]) +
    "° with wind. " +
    " " +
    '<small><a href="#" onclick = "showHistory()">History</a></small>';
}

showWeather();
setInterval(showWeather, 60000); // update the time and weather every 60 seconds.
let savedBody;
let count = 0; //prevents saving the current html more than once to get stuck
function showHistory() {
  if (count == 0) {
    //make sure current page is not already saved to be overwritten
    savedBody = document.getElementsByClassName("saved")[0].innerHTML;
    document.getElementsByClassName("saved")[0].innerHTML =
      "<h2>Graph updated dynamically with Python.</h2><br>\
    <a href='#' onclick = 'goBack()'>Back to main page</a><br>\
  <a><img src='http://andrewcs.ddns.net/temp.png' alt='Cannot load'><a><br />\
  <a><img src='http://andrewcs.ddns.net/outside.png' alt='Cannot load'><a>";
  }
  count = 1;
}
function goBack() {
  count = 0;
  document.getElementsByClassName("saved")[0].innerHTML = savedBody;
}
