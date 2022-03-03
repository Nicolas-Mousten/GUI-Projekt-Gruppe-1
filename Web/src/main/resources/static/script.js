var minute = document.getElementById('minute');
var second = document.getElementById('second');
var food = document.getElementById('food');



(function (){
    var sec = 0;
    var min = 0;
    var foodWaste = 0;

    window.setInterval(myTimerSecond, 1000)
    window.setInterval(myTimerMinute,60000)

    function myTimerSecond() {
        sec++;
        second.innerText = sec;
    }

    function myTimerMinute() {
        min++;
        foodWaste++;
        sec = 0;
        minute.innerText = String(min);
        food.innerText = String(foodWaste);
    }




})()