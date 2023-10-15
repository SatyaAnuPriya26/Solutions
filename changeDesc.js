const userInput = prompt("Enter a list of numbers: ");
const inputArray = userInput.split(" ").map(Number);
function changeDesc(a, b) {
  return b - a;
}
inputArray.sort(changeDesc);
console.log("Sorted array in descending order: " + inputArray);