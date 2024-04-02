<script setup type="module">
import { ref } from 'vue'
// 响应式数据 当发生变化时,会自动更新 dom树
let count = ref(0)
let addCount = () => {
  count.value++
}
let incrCount = (event) => {
  count.value++
  // 通过事件对象阻止组件的默认行为
  event.preventDefault()
}
</script>

<template>
  <div>
    <h1>count的值是:{{ count }}</h1>
    <!-- 方法事件处理器 -->
    <button v-on:click="addCount()">addCount</button> <br />
    <!-- 内联事件处理器 -->
    <button @click="count++">incrCount</button> <br />
    <!-- 事件修饰符 once 只绑定事件一次 -->
    <button @click.once="count++">addOnce</button> <br />
    <!-- 事件修饰符 prevent 阻止组件的默认行为 -->
    <a href="http://www.this0.com" target="_blank" @click.prevent="count++"
      >prevent</a
    >
    <br />
    <!-- 原生js方式阻止组件默认行为 (推荐) -->
    <a href="http://www.this0.com" target="_blank" @click="incrCount($event)"
      >prevent</a
    >
    <br />
  </div>
</template>

<style scoped></style>
