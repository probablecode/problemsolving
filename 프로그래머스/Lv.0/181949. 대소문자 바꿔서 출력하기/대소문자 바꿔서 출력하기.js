const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    answer = "";
    for (i = 0 ; i < str.length; i++)
    {
        const tmp = str[i].toUpperCase();
        if (str[i] === tmp)
            answer += str[i].toLowerCase();
        else
            answer += tmp;
    }
    console.log(answer);
});