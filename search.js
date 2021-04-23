// search.js
// reads user input and outputs data by matching the entered string with strings from a list
// foundation for search engine with server-side database rather than a front-facing hidden list 
// exploration of: Functions, the DOM, arrays and loops

function myFunction() {
   let input = document.getElementById('search'); 
   let filter = input.value.toLowerCase();
    let ol = document.getElementById("list");
    let li = ol.getElementsByTagName('li');

    for(i = 0; i < li.length; i++){
        a = li[i].getElementsByTagName("a")[0];
        txtValue = a.textContent;
        if (txtValue.toLowerCase().indexOf(filter) > -1){
            li[i].style.display = "block";
        }
        else{
            li[i].style.display = "none";
        }
    }
}
