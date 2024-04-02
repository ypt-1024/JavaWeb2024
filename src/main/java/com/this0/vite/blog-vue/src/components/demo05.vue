<script type="module" setup>
    let counter = 0;
    function show(){
        alert(counter);
    }
</script>

<template>
  <div>
    <button @click="counter--">-</button> 
    {{ counter }} 
    <button @click="counter++">+</button>
    <hr>
    <!-- 此案例,我们发现counter值,会改变,但是页面不改变! 默认Vue3的数据是非响应式的!-->
    <button @click="show()">显示counter值</button>
   </div>
</template> 

<style scoped>

</style>
