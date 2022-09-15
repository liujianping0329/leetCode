let secretMessage = ['Learning', 'is', 'not', 'about', 'what', 'you', 'get', 'easily', 'the', 'first', 'time,', 'it', 'is', 'about', 'what', 'you', 'can', 'figure', 'out.', '-2015,', 'Chris', 'Pine,', 'Learn', 'JavaScript'];
secretMessage.pop();
console.log(secretMessage.length);

secretMessage.push("to","Program");

secretMessage[7]='right';
secretMessage.shift();
secretMessage.unshift('Programming');

secretMessage.splice('get', 'right', 'the', 'first', 'time','know');
console.log(secretMessage.join(' '));