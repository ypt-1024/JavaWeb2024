<script type="module">
//ref是VUE3框架提供的一个函数,需要导入
import { ref } from 'vue'
export default {
  setup() {
    //响应式数据:   修改后VUE会更新DOM
    //VUE3中数据要经过ref或者reactive处理后才是响应式的

    //let counter = 1
    //ref处理的响应式数据在js编码修改的时候需要通过.value操作

    //ref响应式数据在绑定到html上时不需要.value

    let counter = ref(1)
    function increase() {
      // 通过.value修改响应式数据
      counter.value++
    }
    function decrease() {
      counter.value--
    }
    return {
      counter,
      increase,
      decrease,
    }
  },
}
</script>
<template>
  <div>
    <button @click="decrease()">-</button>
    {{ counter }}
    <button @click="increase()">+</button>
  </div>
</template>

<style scoped>
button {
  border: 1px solid red;
}
</style>
