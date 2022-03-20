function square(x){
    return x*x;
}
function double(x){
    return x*2;
}
function composedvalue(square,double,N){
    return square(double(N));

}
function compose(double,square,n){
    return double(square(n));
}
//question3
function isEven(n){
    if(n%2==0){
        return true;
    }else{
        return false;
    }
}
var list=[1,3,5,4,2]
function find(list,isEven){
    var count=0;
    for(i=0;i<list.length;i++){
        if(isEven(i)){
            count++;
        }
    }
    return count;
}
//document.write(find(list,isEven));
//question4
var list1=[1,2,3,4,5];
var list3=[1,4,9,16,25];
function map(list1,square){
    var list4=[];
    for(i=1;i<=list1.length;i++){
        list4.push(square(i));
    }
    return list4;
}
document.write(map(list1,square));

//Advance
function isEven(num)
{
return(num%2 == 0);
}
function find(arr, fun) {
    var i=0;
    while (i<arr.length) {
        if (fun(arr[i]))
        {
            console.log(arr[i]);
            break;
        }

        else{
        return find(arr.slice(i+1, arr.length), fun(arr[i+1]));
        }
    }
};

//question2