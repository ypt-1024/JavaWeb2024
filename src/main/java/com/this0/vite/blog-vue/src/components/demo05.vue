<script type="module" setup>
/* 从vue中引入reactive方法 */
import {ref, reactive} from 'vue'

let data = reactive({
  counter: 0
})

function show() {
  alert(data.counter);
}

/* 函数中要操作reactive处理过的数据,需要通过 对象名.属性名的方式 */
let decr = () => {
  data.counter--;
}
let incr = () => {
  data.counter++;
}
</script>

<template>
  <div>
    <button @click="data.counter--">-</button>
    <button @click="decr()">-</button>
    {{ data.counter }}
    <button @click="data.counter++">+</button>
    <button @click="incr()">+</button>
    <hr>
    <button @click="show()">显示counter值</button>
  </div>
</template>

<style scoped>

</style>