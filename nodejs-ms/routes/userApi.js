const express = require('express')
const bcrypt = require('bcryptjs')
const User = require('../models/userSchema')
const router = express.Router()

// Get all Users
router.get('/users', async (req, res) => {
  const users = await User.find()
  res.json(users)
})

// Get User by id
router.get('/users/:id', async (req, res) => {
  const userDetails = await User.findById(req.params.id)
  res.json(userDetails)
})

// Add new User
router.post('/users', async (req, res) => {
  const createdUser = await User.create(req.body)
  // 1. Hash the password
  const salt = bcrypt.genSaltSync(10)
  const hash = bcrypt.hashSync(req.body.password, salt)
  // 2. update password
  createdUser.password = hash
  createdUser.save()
  // 3. send response
  res.json(createdUser)
})

// Update a User by ID
router.put('/users/:id', async (req, res) => {
  const updatedUser = await User.findByIdAndUpdate(req.params.id, req.body, {
    new: true,
  })
  res.json(updatedUser)
})

// Delete User by ID
router.delete('/users/:id', async (req, res) => {
  await User.findByIdAndRemove(req.params.id)
  res.json({ message: 'User deleted successfully!' })
})

module.exports = router
