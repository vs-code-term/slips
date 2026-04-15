function checkNumber() {
    let num = document.getElementById("number").value;

    if (num === "") {
        document.getElementById("result").innerHTML = "Please enter a number";
        return;
    }

    num = parseFloat(num);

    if (num > 0) {
        document.getElementById("result").innerHTML = "Number is Positive";
    } 
    else if (num < 0) {
        document.getElementById("result").innerHTML = "Number is Negative";
    } 
    else {
        document.getElementById("result").innerHTML = "Number is Zero";
    }
}