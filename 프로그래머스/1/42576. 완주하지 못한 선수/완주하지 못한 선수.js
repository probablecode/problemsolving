function solution(participant, completion) {
    const hash = {};
    for (const part of participant)
        hash[part] = hash[part] === undefined ? 1 : hash[part] + 1;
    for (const comp of completion) {
        if (hash[comp]-- === 1)
            delete hash[comp];
    }
    console.log(hash);
    
    return (Object.keys(hash)[0]);
    
}