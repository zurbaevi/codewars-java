package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun dutyFree(normPrice: Int, discount: Int, hol: Int): Int {
    return hol * 100 / (normPrice * discount)
}