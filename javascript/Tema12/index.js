function fibonacci(num){
    
    let list = [0,1]
    for( let i = 2; i < num+1 ; i++){
        list.push(list[i-1]+list[i-2]); // breakpoint
    }

    return list;
    
}

console.log(fibonacci(6)); // breakpoint