<script setup type="module">
let msg = 'hello vue3'
let getMsg = () => {
  return 'hello vue3 message'
}
let age = 19
let bee = '蜜 蜂'
// 购物车
const carts = [
  { name: '可乐', price: 3, number: 10 },
  { name: '薯片', price: 6, number: 8 },
]
//计算购物车总金额
function compute() {
  let count = 0
  for (let index in carts) {
    count += carts[index].price * carts[index].number
  }
  return count
}
</script>

<template>
  <div>
    <h1>{{ msg }}</h1>
    msg的值为: {{ msg }} <br />
    getMsg返回的值为:{{ getMsg() }} <br />
    是否成年: {{ age >= 18 ? 'true' : 'false' }} <br />
    反转: {{ bee.split(' ').reverse().join('-') }} <br />
    购物车总金额: {{ compute() }} <br />
    购物车总金额:
    {{ carts[0].price * carts[0].number + carts[1].price * carts[1].number }}
    <br />
  </div>
</template>

<style scoped></style>
