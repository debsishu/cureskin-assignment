const input = { a: 1, b: 2, c: 3 };
const output = [];

for (const [key, value] of Object.entries(input)) {
  const temp = {
    [key]: value,
  };
  output.push(temp);
}

console.log(output);
