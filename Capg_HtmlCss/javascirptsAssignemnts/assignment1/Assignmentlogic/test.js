function numberSum(N) {//question1
    var total = 0;
      for(var i = 1; i <= N; i++){
        total += i;
      }
      return total;
  }
  //question2
  function multipleof3and5(N){
      var total=0;
      for(var i=1;i<=N;i++){
          if((i/3==0) || (i/5==0)){
              total+=i;
          }
      }
      return total;
  }
  //question3
  function evenorodd(val){
      if(val/2==0){
          return "even";
      }else{
          return "odd";
      }

  }
  //question4
  function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; 
}

var howManyTimes=500;
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}
console.log("headsratio:"+(countHeads/howManyTimes));
  //question5
  function leapyear(N){
      for(i=2022;i<=(2022+N);i++){
        if ((0 == i % 4) && (0 !=i % 100) || (0 == i % 400)){
            console.log(i + " its a leapyear")
        }
      }

  }
  //question6
  var list= ["Hello", "World", "in", "a", "frame"];
  function loop(){
      console.log("***********");
      for(i=0;i<list.length;i++){
          console.log("*"+list[i]+"*");
      }
      console.log("***********");
  }
  //question7
  function currency(val2){
      var val3=parseFloat(val2);
      var ind="Indian rupee "+val3*74.28;
      var jap="Janpanese Yen " + val3*109.14;
      var euro="Euro "+val3*0.84;
      var pound="pound streling "+val3*0.72;
      var myarray=[ind,jap,euro,pound];
      return myarray;
  }
  //question8
  function concatnation(){
      var list1=[1,2,3];
      var list2=[a,b,c];
      var totallist=list1.concat(list2);
      return totallist;
  }
  //question9
  function alternateMerge(arr1, arr2, n1,
    n2, arr3)
{
let i = 0, j = 0, k = 0;

// Traverse both array
while (i<n1 && j <n2)
{
arr3[k++] = arr1[i++];
arr3[k++] = arr2[j++];
}

while (i < n1)
arr3[k++] = arr1[i++];


while (j < n2)
arr3[k++] = arr2[j++];
}
let arr1 = [1, 3, 5, 7, 9, 11];
    let n1 = arr1.length;
 
    let arr2 = [2, 4, 6, 8];
    let n2 = arr2.length;
 
    let arr3 = new Array(n1+n2);
    alternateMerge(arr1, arr2, n1, n2, arr3);
 
    document.write("Array after merging" + "<br>");
    for (let i=0; i < n1+n2; i++)
        document.write(arr3[i] + " ");
//question10
function fib(n){

    if(n<=1){
        return n;
    }else{
        return fib(n-1)+fib(n-2);
    }
}
//document.write(fib(100));
  function run2(){
      val2=document.getElementById("val2").value;
      document.getElementById("results").innerHTML=val2+": "+currency(val2);
  }

  
  function run(){
    val = document.getElementById("val").value;
    document.getElementById("results").innerHTML=val+": "+numberSum(val);
    }


//question11
let list=[1,2,"a","#",4,5,6,7];
let revList=list.reverse();
console.log(revList);

//question12

var count =0;
var max=0;
var j =0;
var str="abbacdefabhjk";
var strRes;
function fun(string)
{
    for(let i=0;i<str.length;i++)
    {
        if(str.charAt(i)=="a" || str.charAt(i)=="b")
        {
            if(count>max)
            {
                
                max=count;
                strRes=str.substring(j,i-1);
                j=i;
                count=0;
            }
            
        }
        else
        {
             count++;
        }   
        
    }
    console.log(strRes);

}
fun(str);

//question13

var sum=0;
var Arr=[12,13,24,42,65,89,90,56];
function funA(Array)
{
    for(let i=0;i<Array.length;i++)
    {
        sum+=Array[i];
    }
     console.log(sum);
}
funA(Arr);
function funB(Array)
{
    let i=0;
        while(i < Array.length)
        {
            sum += Array[i];
            i++;
        }
        console.log(sum);

}
funB(Arr);
function funC(Array)
{
    var i=0;
    do{
        sum+=Array[i];
        i++;
    }
    while(i<Array.length)
    console.log(sum);
}
funC(Arr);

//question14
var i =0;
function largest(Array)
{
     var res=0;
    for(i=0;i<Array.length;i++)
    {
        if(Array[i]>res)
        {
            res=Array[i];
        }
    }
    console.log(res);
}
function smallest(Array)
{
    var res=0;
    for(i=0;i<Array.length;i++)
    {
        if(Array[i]<res)
        {
            res=Array[i];
        }
    }
    console.log(res);
}
function count(Array)
{
    var countEve=0;
    var countOdd=0;
    for(i=0;i<Array.length;i++)
    {
        if(Array[i]%2==0)
        {
            countEve++;
        }
        else
        {
            countOdd++;
        }
    }
    if(countEve > countOdd)
    {
        console.log("Even count is greater than odd count:" + countEve);
    }
    else
    {
        console.log("Odd count is greater than even count:" + countOdd);
    }
}
function avg(Array)
{
    var sum = 0;
    for(i=0;i<Array.length;i++)
    {
        sum+=Array[i];
    }
    console.log(sum);
    var avg =sum/Array.length;
    console.log(avg);

}
//question15
function bubbleSort(arr, n)
    {
        var i, j, temp;
        var swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
           
            if (swapped == false)
                break;
        }
    }
 
    
    function printArray(arr, size)
    {
        var i;
        for (i = 0; i < size; i++)
            document.write(arr[i] + " ");
        document.writeln();
    }
 
    
        var arr = [ 64, 34, 25, 12, 22, 11, 90 ];
        var n = arr.length;
        bubbleSort(arr, n);
        document.write("Sorted array: ");
        printArray(arr, n);

//question16
//question17
function leftRotate(arr , d , n) {
    for (i = 0; i < d; i++)
        leftRotatebyOne(arr, n);
}

function leftRotatebyOne(arr , n) {
    var i, temp;
    temp = arr[0];
    for (i = 0; i < n - 1; i++)
        arr[i] = arr[i + 1];
    arr[n - 1] = temp;
}

function printArray(arr , n) {
    for (i = 0; i < n; i++)
        document.write(arr[i] + " ");
}
//question18
var str="askaiye bachj tygdsvd"
function latin_changer()
{
    
    arr=str.split(" ");
    len=arr.length;
    for(let i =0;i<len;i++)
    {
        temp=arr[i].charAt[0];
        for(let j=1;j<arr[i].length;j++)
        {
            
            arr[i].charAt[j-1]=arr[i].charAt[j];
            
        }
        arr[i].charAt[arr[i].length-1]=temp;
        arr[i].concat("ay");
    }
    str=arr.toString();
    console.log(str);
}