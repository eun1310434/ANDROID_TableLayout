/*=====================================================================
□ INFORMATION
  ○ Data : 28.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ FUNCTION
  ○

□ STUDY
  ○ Table Layout
     - A layout that arranges its children into rows and columns.
       A TableLayout consists of a number of TableRow objects, each defining a row
       (actually, you can have other children, which will be explained below).
       TableLayout containers do not display border lines for their rows, columns, or cells.
       Each row has zero or more cells; each cell can hold one View object.
       The table has as many columns as the row with the most cells.
       A table can leave cells empty.
       Cells can span columns, as they can in HTML.
=====================================================================*/

package com.eun1310434.tablelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_input);
    }
}
