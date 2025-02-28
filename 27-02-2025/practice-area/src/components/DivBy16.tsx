function DivBy16() {
  let v = 102;

  if (v % 16 === 0) return <h1>{v} is divisible by 16</h1>;
  else return <h1>{v} is not divisible by 16</h1>;
}

export default DivBy16;
