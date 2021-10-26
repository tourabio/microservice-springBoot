'use strict'

const express = require('express')
const eurekaConfig = require('./eurekaConfig')
var cors = require('cors')
const dotenv = require('dotenv')

dotenv.config()
const con = require('./database/db')
const userApi = require('./routes/userApi')

const app = express()
//eurekaConfig.registerWithEureka()
app.use(cors())
app.use(express.json())
app.use(express.urlencoded({ extended: true }))
app.use('/api/v1', userApi)

app.get('/', (req, res) => {
  res.send('hello world')
})

const PORT = process.env.PORT || 5000

app.listen(
  PORT,
  console.log(`server running in ${process.env.NODE_ENV} mode on port ${PORT}`)
)
