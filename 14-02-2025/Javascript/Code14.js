for (let i = 1; i <= 5; i++) {
    if (i === 3) {
        console.log("Break statement at i = "+i+ "\n")
        break
    }
    console.log(i);
}

for (let i = 1; i <= 5; i++) {
    if (i === 3) {
        console.log("Continue statement at i = "+i)
        continue
    };
    console.log(i);
}