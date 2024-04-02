<script type="module" setup>
/* 从vue中引入ref方法 */
import { ref } from 'vue'
let counter = ref(0)
function show() {
  alert(counter.value)
}
/* 函数中要操作ref处理过的数据,需要通过.value形式 */
let decr = () => {
  counter.value--
}
let incr = () => {
  counter.value++
}
</script>

<template>
  <div>
    <button @click="counter--">-</button>
    <button @click="decr()">-</button>
    {{ counter }}
    <button @click="counter++">+</button>
    <button @click="incr()">+</button>
    <hr />
    <button @click="show()">显示counter值</button>
  </div>
</template>

<style scoped></style>
