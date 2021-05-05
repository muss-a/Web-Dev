// JavaScript for the Timer Web App

window.onload = function () {
  
    var seconds = 00; 
    var mili = 00; 
    var appendMili = document.getElementById("miliseconds")
    var appendSeconds = document.getElementById("seconds")
    var buttonStart = document.getElementById('start');
    var buttonStop = document.getElementById('stop');
    var buttonReset = document.getElementById('reset');
    var Interval ;
  
    buttonStart.onclick = function() {
      
       clearInterval(Interval);
       Interval = setInterval(startTimer, 10);
    }
    
      buttonStop.onclick = function() {
         clearInterval(Interval);
    }
    
  
    buttonReset.onclick = function() {
       clearInterval(Interval);
      mili = "00";
        seconds = "00";
      appendMili.innerHTML = mili;
        appendSeconds.innerHTML = seconds;
    }
    
     
    
    function startTimer () {
      mili++; 
      
      if(mili <= 9){
        appendMili.innerHTML = "0" + mili;
      }
      
      if (mili > 9){
        appendMili.innerHTML = mili;
        
      } 
      
      if (mili > 99) {
        console.log("seconds");
        seconds++;
        appendSeconds.innerHTML = "0" + seconds;
        mili = 0;
        appendMili.innerHTML = "0" + 0;
      }
      
      if (seconds > 9){
        appendSeconds.innerHTML = seconds;
      }
    
    }
    
  
  }