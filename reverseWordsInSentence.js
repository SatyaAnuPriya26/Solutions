function reverseWordsInSentence(sentence){
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' '); 
    return reversedSentence;
}
let inputSentence = prompt("please enter the sentence ");
const reversed = reverseWordsInSentence(inputSentence);
console.log(reversed);