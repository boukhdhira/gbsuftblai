package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {
    companion object {
        const val GBSU = "Gbsu"
        const val FTB = "Ftb"
        const val LAI = "Lai"
    }
    fun convertNumber(inputNumber: Int): String {
        var str:String = inputNumber.toString()
        val builder = StringBuilder()
        if(inputNumber %3==0) {
            builder.append(GBSU)
        }
        if(inputNumber %5==0 ) {
            builder.append(FTB)
        }
        for (i in 0..str.length-1) {
            if(str[i]=='3'){
                builder.append(GBSU)
            }
            if( str[i]=='5') {
                builder.append(FTB)
            }
            if(str[i]=='7') {
                builder.append(LAI)
            }
        }
        var output = builder.toString()
        return if (output.isNullOrEmpty()) str else output
    }

}