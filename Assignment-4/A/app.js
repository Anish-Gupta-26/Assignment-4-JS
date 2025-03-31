//Declaring variables using let, var and const
let a=1;
var b=2;
const c=3;

//Functions
function calculateBMI(weight, height) {
    let bmi = weight / (height * height);
    return bmi;
}
//Example
console.log("BMI:", calculateBMI(60, 1.79));

//conditional statements
function validateAge(age) {
    if (age < 0) {
        console.log("Age cannot be negative!");
    } else if (age < 18) {
        console.log("You are a minor.");
    } else {
        console.log("You are an adult.");
    }
}

function checkDay(day) {
    switch(day.toLowerCase()) {
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
            console.log("It's a weekday.");
            break;
        case "saturday":
        case "sunday":
            console.log("It's the weekend!");
            break;
        default:
            console.log("Invalid day.");
    }
}

validateAge(20);
checkDay("Saturday");

