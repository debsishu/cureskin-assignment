const input = [{ a: 1 }, { b: 2 }, { c: 3 }];
const output = {};

input.map((e) => {
  const [key] = Object.keys(e);
  output[key] = e[key];
});

console.log(output);
