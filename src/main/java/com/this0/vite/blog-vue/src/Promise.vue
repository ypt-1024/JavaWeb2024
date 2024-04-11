<script>

/*
 1.实例化promise对象
 参数: resolve,reject随意命名

 */
let promise = new Promise(function(resolve,reject){

  console.log("promise do some code ... ...")

  // 参数: resolve,reject分别负责处理 成功 和 失败 两个函数!
  //调用resolve就变成成功状态，调用reject就变成失败状态
      //resolve("promise success")
  reject("promise fail")
})

//2.获取回调函数结果  then在这里会等待promise中的运行结果,但是不会阻塞代码继续运行
promise.then(

    //前者是成功的回调，里面的参数value也可以自己命名，自动获取resolve里面的参数
    function(value){console.log(`promise中执行了resolve:`+value)},

    //后者是失败的回调，同理
    function(error){console.log(`promise中执行了reject:`+error)}
)
//这个返回也是一个promise函数

// 3 其他代码执行
console.log('other code2222 invoked')
</script>

<template>
<div>Promise页面</div>
</template>

<style scoped>

</style>