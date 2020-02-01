package com.example.ex

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    var player : Boolean = true
    var turn : Int=0
    private fun check_black(board : Array<Array<Int>>,button : Array<Array<Button>>,r : Int, c :Int) : Boolean{
        var ans : Boolean = false
        //horizontal_f
        if((c+2)<=7&&board[r][c+1]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (c+2)..7){
               if(board[r][i]==1&&cnt==0&&nog>=1){
                   ind=i
                   break
               }
                if(board[r][i]==-1)
                    cnt++
                if(board[r][i]==0)
                    nog++
            }
            if(i<=7&&ind!=-1){
                for(j in (c)..(ind)){
                    button[r][j].isEnabled=false
                    button[r][j].setBackgroundColor(Color.BLACK)
                    board[r][j]=1
                }
                ans=true
            }

        }
        //horizontal_r
         if((c-2)>=0&&board[r][c-1]==0){
             var cnt : Int=0
             var nog : Int=1
             var ind : Int=-1
             var i : Int=0
             for(i in (c-1) downTo 0){
                 if(board[r][i]==1&&cnt==0&&nog>=1){
                     ind=i
                     break
                 }
                 if(board[r][i]==-1)
                     cnt++
                 if(board[r][i]==0)
                     nog++
             }
             if(i>=0&&ind!=-1){
                 for(j in (c) downTo (ind)){
                     button[r][j].isEnabled=false
                     button[r][j].setBackgroundColor(Color.BLACK)
                     board[r][j]=1
                 }
                 ans=true
             }

         }
        // vertical_d
        if((r+2)<=7&&board[r+1][c]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (r+2 )..7){
                if(board[i][c]==1&&cnt==0&&nog>=1){
                    ind=i
                    break
                }
                if(board[i][c]==-1)
                    cnt++
                if(board[i][c]==0)
                    nog++
            }
            if(i<=7&&ind!=-1){
                for(j in (r)..(ind)){
                    button[j][c].isEnabled=false
                    button[j][c].setBackgroundColor(Color.BLACK)
                    board[j][c]=1
                }
                ans=true
            }


        }
        //vertical_u
        if((r-2)>=0&&board[r-1][c]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (r-1) downTo 0){
                if(board[i][c]==1&&cnt==0&&nog>=1){
                    ind=i
                    break
                }
                if(board[i][c]==-1)
                    cnt++
                if(board[i][c]==0)
                    nog++
            }
            if(i>=0&&ind!=-1){
                for(j in (r) downTo (ind)){
                    button[j][c].isEnabled=false
                    button[j][c].setBackgroundColor(Color.BLACK)
                    board[j][c]=1
                }
                ans=true
            }

        }
        //diagonal1
        if((r-2)>=0&&(c-2)>=0&&board[r-1][c-1]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r-1
            var j : Int=c-1
            while(i>=0&&j>=0){
                if(board[i][j]==1&&cnt==0&&nog>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==0)
                    nog++
                i--
                j--
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i>=ind1&&j>=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.BLACK)
                    board[i][j]=1
                    i--;
                    j--;
                }
                ans=true
            }
        }
        //diagonal2
        if((r+2)<=7&&(c+2)<=7&&board[r+1][c+1]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r+1
            var j : Int=c+1
            while(i<=7&&j<=7){
                if(board[i][j]==1&&cnt==0&&nog>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==0)
                    nog++
                i++
                j++
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i<=ind1&&j<=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.BLACK)
                    board[i][j]=1
                    i++;
                    j++;
                }
                ans=true
            }
        }
        //diagonal3
        if((r-2)>=0&&(c+2)<=7&&board[r-1][c+1]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r-1
            var j : Int=c+1
            while(i>=0&&j<=7){
                if(board[i][j]==1&&cnt==0&&nog>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==0)
                    nog++
                i--
                j++
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i>=ind1&&j<=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.BLACK)
                    board[i][j]=1
                    i--;
                    j++;
                }
                ans=true
            }
        }
        //diagonal4
        if((r+2)<=7&&(c-2)>=0&&board[r+1][c-1]==0){
            var cnt : Int=0
            var nog : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r+1
            var j : Int=c-1
            while(i<=7&&j>=0){
                if(board[i][j]==1&&cnt==0&&nog>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==0)
                    nog++
                i++
                j--
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i<=ind1&&j>=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.BLACK)
                    board[i][j]=1
                    i++;
                    j--;
                }
                ans=true
            }
        }

            return ans
    }
    private fun check_green(board : Array<Array<Int>>,button : Array<Array<Button>>,r : Int, c : Int) : Boolean{
        var ans : Boolean = false
        //horizontal_f
        if((c+2)<=7&&board[r][c+1]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (c+2)..7){
                if(board[r][i]==0&&cnt==0&&nob>=1){
                    ind=i
                    break
                }
                if(board[r][i]==-1)
                    cnt++
                if(board[r][i]==1)
                    nob++
            }
            if(i<=7&&ind!=-1){
                for(j in (c)..(ind)){
                    button[r][j].isEnabled=false
                    button[r][j].setBackgroundColor(Color.GREEN)
                    board[r][j]=0
                }
                ans=true
            }

        }
        //horizontal_r
        if((c-2)>=0&&board[r][c-1]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (c-1) downTo 0){
                if(board[r][i]==0&&cnt==0&&nob>=1){
                    ind=i
                    break
                }
                if(board[r][i]==-1)
                    cnt++
                if(board[r][i]==1)
                    nob++
            }
            if(i>=0&&ind!=-1){
                for(j in (c) downTo (ind)){
                    button[r][j].isEnabled=false
                    button[r][j].setBackgroundColor(Color.GREEN)
                    board[r][j]=0
                }
                ans=true
            }

        }
        // vertical_d
        if((r+2)<=7&&board[r+1][c]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (r+2)..7){
                if(board[i][c]==0&&cnt==0&&nob>=1){
                    ind=i
                    break
                }
                if(board[i][c]==-1)
                    cnt++
                if(board[i][c]==1)
                    nob++
            }
            if(i<=7&&ind!=-1){
                for(j in (r)..(ind)){
                    button[j][c].isEnabled=false
                    button[j][c].setBackgroundColor(Color.GREEN)
                    board[j][c]=0
                }
                ans=true
            }

        }
        //vertical_u
        if((r-2)>=0&&board[r-1][c]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind : Int=-1
            var i : Int=0
            for(i in (r-1) downTo 0){
                if(board[i][c]==0&&cnt==0&&nob>=1){
                    ind=i
                    break
                }
                if(board[i][c]==-1)
                    cnt++
                if(board[i][c]==1)
                    nob++
            }
            if(i>=0&&ind!=-1){
                for(j in (r) downTo (ind)){
                    button[j][c].isEnabled=false
                    button[j][c].setBackgroundColor(Color.GREEN)
                    board[j][c]=0
                }
                ans=true
            }

        }
        //diagonal1
        if((r-2)>=0&&(c-2)>=0&&board[r-1][c-1]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r-1
            var j : Int=c-1
            while(i>=0&&j>=0){
                if(board[i][j]==0&&cnt==0&&nob>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==1)
                    nob++
                i--
                j--
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i>=ind1&&j>=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.GREEN)
                    board[i][j]=0
                    i--;
                    j--;
                }
                ans=true
            }
        }
        //diagonal2
        if((r+2)<=7&&(c+2)<=7&&board[r+1][c+1]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r+1
            var j : Int=c+1
            while(i<=7&&j<=7){
                if(board[i][j]==0&&cnt==0&&nob>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==1)
                    nob++
                i++
                j++
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i<=ind1&&j<=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.GREEN)
                    board[i][j]=0
                    i++;
                    j++;
                }
                ans=true
            }
        }
        //diagonal3
        if((r-2)>=0&&(c+2)<=7&&board[r-1][c+1]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r-1
            var j : Int=c+1
            while(i>=0&&j<=7){
                if(board[i][j]==0&&cnt==0&&nob>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==1)
                    nob++
                i--
                j++
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i>=ind1&&j<=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.GREEN)
                    board[i][j]=0
                    i--;
                    j++;
                }
                ans=true
            }
        }
        //diagonal4
        if((r+2)<=7&&(c-2)>=0&&board[r+1][c-1]==1){
            var cnt : Int=0
            var nob : Int=1
            var ind1 : Int=-1
            var ind2 : Int=-1
            var i : Int=r+1
            var j : Int=c-1
            while(i<=7&&j>=0){
                if(board[i][j]==0&&cnt==0&&nob>=1){
                    ind1=i
                    ind2=j
                    break
                }
                if(board[i][j]==-1)
                    cnt++
                if(board[i][j]==1)
                    nob++
                i++
                j--
            }
            if(ind1!=-1&&ind2!=-1){
                i=r
                j=c
                while(i<=ind1&&j>=ind2){
                    button[i][j].isEnabled=false
                    button[i][j].setBackgroundColor(Color.GREEN)
                    board[i][j]=0
                    i++;
                    j--;
                }
                ans=true
            }
        }

        return ans
    }
    private fun checkwinner(board : Array<Array<Int>>){
        var b : Int=0
        var y : Int=0
        for(i in 0..7){
            for(j in 0..7){
                if(board[i][j]==-1)
                    continue
                if(board[i][i]==1)
                    b++
                if(board[i][j]==0)
                    y++
            }
        }
        if(b>y)
            result.text = "PLAYER 1 WINS"
        else if(y>b)
            result.text = "PLAYER 2 WINS"
        else
            result.text = "DRAW"
    }
    var board : Array<Array<Int>> = arrayOf(
        arrayOf(),
        arrayOf(),
        arrayOf(),
        arrayOf(),
        arrayOf(),
        arrayOf(),
        arrayOf(),
        arrayOf()
    )
    private fun reset_board(board : Array<Array<Int>>,button : Array<Array<Button>>) : Unit {
        for(i in 0..7){
            for(j in 0..7){
                board[i][j]=-1
                button[i][j].isEnabled=true
                button[i][j].setBackgroundResource(android.R.drawable.btn_default);
            }
        }
        board[3][3]=1
        board[3][4]=0
        board[4][3]=0
        board[4][4]=1
        button[3][3].isEnabled=false
        button[3][4].isEnabled=false
        button[4][3].isEnabled=false
        button[4][4].isEnabled=false
        button[3][3].setBackgroundColor(Color.BLACK)
        button[3][4].setBackgroundColor(Color.GREEN)
        button[4][4].setBackgroundColor(Color.BLACK)
        button[4][3].setBackgroundColor(Color.GREEN)
        return
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Array<Array<Button>> = arrayOf(
            arrayOf(b00,b01,b02,b03,b04,b05,b06,b07),
            arrayOf(b10,b11,b12,b13,b14,b15,b16,b17),
            arrayOf(b20,b21,b22,b23,b24,b25,b26,b27),
            arrayOf(b30,b31,b32,b33,b34,b35,b36,b37),
            arrayOf(b40,b41,b42,b43,b44,b45,b46,b47),
            arrayOf(b50,b51,b52,b53,b54,b55,b56,b57),
            arrayOf(b60,b61,b62,b63,b64,b65,b66,b67),
            arrayOf(b70,b71,b72,b73,b74,b75,b76,b77)
        )
        board = arrayOf(
            arrayOf(-1,-1,-1,-1,-1,-1,-1,-1),
            arrayOf(-1,-1,-1,-1,-1,-1,-1,-1),
            arrayOf(-1,-1,-1,-1,-1,-1,-1,-1),
            arrayOf(-1,-1,-1,1,0,-1,-1,-1),
            arrayOf(-1,-1,-1,0,1,-1,-1,-1),
            arrayOf(-1,-1,-1,-1,-1,-1,-1,-1),
            arrayOf(-1,-1,-1,-1,-1,-1,-1,-1),
            arrayOf(-1,-1,-1,-1,-1,-1,-1,-1)
        )
        button[3][3].setBackgroundColor(Color.BLACK)
        button[3][4].setBackgroundColor(Color.GREEN)
        button[4][4].setBackgroundColor(Color.BLACK)
        button[4][3].setBackgroundColor(Color.GREEN)
        button[3][3].isEnabled=false
        button[3][4].isEnabled=false
        button[4][3].isEnabled=false
        button[4][4].isEnabled=false
        reset.setOnClickListener {
            reset_board(board,button)
            result.text="WINNER"
            turn=0
            player = true
        }
        go.setOnClickListener {
            checkwinner(board)
        }
        for(i in 0..7) {
            for (j in 0..7) {
                if (!button[i][j].isEnabled)
                    continue
                button[i][j].setOnClickListener {
                if (turn%2==0) {
                    var b: Boolean = check_black(board,button,i,j)
                    if(b) {
                        button[i][j].isEnabled = false
                        button[i][j].setBackgroundColor(Color.BLACK)
                        board[i][j] = 1
                        turn++
                    }

                }
                else  {
                        var g: Boolean = check_green(board,button,i,j)
                    if(g) {
                        button[i][j].isEnabled = false
                        button[i][j].setBackgroundColor(Color.GREEN)
                        board[i][j] = 0
                        turn++
                    }
                }

            }
        }
        }

    }
}
