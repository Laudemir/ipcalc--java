package com.example.ipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Objetos da tela
    private SeekBar seekBar;
    private TextView cidrResult;
    private EditText enderecoIp;
    private TextView ip;
    private TextView mascara;
    private TextView rede;
    private TextView primeiro;
    private TextView ultimo;
    private TextView broadcast;
    private TextView hosts;

    private boolean msg=true;
    private int a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String t = "";
        t=Integer.toBinaryString(252);
        //Log.i("DADOS","Binario : "+ t);
        // Começa o código
        seekBar = findViewById(R.id.seekBar);
        cidrResult = findViewById(R.id.textResult);

        cidrResult.setText("255.255.255.0 / 24");
        a=255; b=255; c=255; d=0;

        // Set Min and Max of seekBar
        seekBar.setProgress(24);

        // Atenção
        // Para configurar o min no Seekbar
        // só funciona a partir do Android Oreo (8.0) API 26
        // Não consegui fazer isto por software
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        //    seekBar.setMin(8);
        //}
        seekBar.setMax(31);

        //seekBar.setEnabled(false);


        //calcular(a,b,c,d, 24);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean j) {
                //cidrResult.setText("0.0.0.0 / " + seekBar.getProgress());
                switch(i){
                    case 1:
                        cidrResult.setText("128.0.0.0 / " + seekBar.getProgress());
                        a=128; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 2:
                    cidrResult.setText("192.0.0.0 / " + seekBar.getProgress());
                        a=192; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                    break;
                    case 3:
                        cidrResult.setText("224.0.0.0 / " + seekBar.getProgress());
                        a=224; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 4:
                        cidrResult.setText("240.0.0.0 / " + seekBar.getProgress());
                        a=240; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 5:
                        cidrResult.setText("248.0.0.0 / " + seekBar.getProgress());
                        a=248; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 6:
                        cidrResult.setText("252.0.0.0 / " + seekBar.getProgress());
                        a=252; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 7:
                        cidrResult.setText("254.0.0.0 / " + seekBar.getProgress());
                        a=254; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 8:
                        cidrResult.setText("255.0.0.0 / " + seekBar.getProgress());
                        a=255; b=0; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 9:
                        cidrResult.setText("255.128.0.0 / " + seekBar.getProgress());
                        a=255; b=128; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 10:
                        cidrResult.setText("255.192.0.0 / " + seekBar.getProgress());
                        a=255; b=192; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 11:
                        cidrResult.setText("255.224.0.0 / " + seekBar.getProgress());
                        a=255; b=192; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 12:
                        cidrResult.setText("255.240.0.0 / " + seekBar.getProgress());
                        a=255; b=240; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 13:
                        cidrResult.setText("255.248.0.0 / " + seekBar.getProgress());
                        a=255; b=248; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 14:
                        cidrResult.setText("255.252.0.0 / " + seekBar.getProgress());
                        a=255; b=252; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 15:
                        cidrResult.setText("255.254.0.0 / " + seekBar.getProgress());
                        a=255; b=254; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 16:
                        cidrResult.setText("255.255.0.0 / " + seekBar.getProgress());
                        a=255; b=255; c=0; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 17:
                        cidrResult.setText("255.255.128.0 / " + seekBar.getProgress());
                        a=255; b=255; c=128; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 18:
                        cidrResult.setText("255.255.192.0 / " + seekBar.getProgress());
                        a=255; b=255; c=192; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 19:
                        cidrResult.setText("255.255.224.0 / " + seekBar.getProgress());
                        a=255; b=255; c=224; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 20:
                        cidrResult.setText("255.255.240.0 / " + seekBar.getProgress());
                        a=255; b=255; c=240; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 21:
                        cidrResult.setText("255.255.248.0 / " + seekBar.getProgress());
                        a=255; b=255; c=248; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 22:
                        cidrResult.setText("255.255.252.0 / " + seekBar.getProgress());
                        a=255; b=255; c=252; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 23:
                        cidrResult.setText("255.255.254.0 / " + seekBar.getProgress());
                        a=255; b=255; c=254; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 24:
                        cidrResult.setText("255.255.255.0 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=0;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 25:
                        cidrResult.setText("255.255.255.128 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=128;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 26:
                        cidrResult.setText("255.255.255.192 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=192;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 27:
                        cidrResult.setText("255.255.255.224 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=224;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 28:
                        cidrResult.setText("255.255.255.240 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=240;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 29:
                        cidrResult.setText("255.255.255.248 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=248;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 30:
                        cidrResult.setText("255.255.255.252 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=252;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                    case 31:
                        cidrResult.setText("255.255.255.254 / " + seekBar.getProgress());
                        a=255; b=255; c=255; d=254;
                        calcular (a, b, c, d, seekBar.getProgress());
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Nada a fazer aqui
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Nada a fazer aqui
            }
        });
    }
    // Funçoes começam aqui

    // Função mostrar o cálculo de rede/subrede conforme a máscara informada
    private void calcular(int a, int b, int c, int d, int hostsPerSubnet) {
        enderecoIp = findViewById(R.id.editIP);        // O endereço IP
        rede       = findViewById(R.id.textNetwork);   // O endereço de rede
        primeiro   = findViewById(R.id.textFirst);     // O endereço primeiro IP
        ultimo     = findViewById(R.id.textLast);      // O endereço último IP
        broadcast  = findViewById(R.id.textBroadcast); // O endereço de Broadcast
        ip = findViewById(R.id.textIP);                // O endereço IP a ser mostrado
        mascara = findViewById(R.id.textMask);         // A máscara
        hosts = findViewById(R.id.textHosts);

        // Calcula quantos hosts é possivel de acordo
        // com a máscara
        long expBits = (long) Math.pow(2, (32-hostsPerSubnet));
        expBits = expBits - 2;

        if (enderecoIp.getText().length() != 0) {
            // Retirando pontuação decimal do IP informado
            // e guardando em uma matriz
            try{
                // Alterar ip informado de forma String para decimal.
                // Primeiro retira os pontos da string e preenche um array
                // Altera strings do array para números decimais inteiro
                //
                String i = enderecoIp.getText().toString()
                        .replace(".", ";");

                // Cria um Array de Strings
                String[] ips = i.split(";");

                // Transforma String em Decimal em cada elemento do Array
                int dIP1 = Integer.parseInt(ips[0]);
                int dIP2 = Integer.parseInt(ips[1]);
                int dIP3 = Integer.parseInt(ips[2]);
                int dIP4 = Integer.parseInt(ips[3]);

                // Mostra o campo ip
                ip.setText(enderecoIp.getText());

                // Mascara
                mascara.setText(a + "." + b + "." + c + "." + d);

                // hosts per subnet
                hosts.setText(""+expBits);

                // Rede [ IP & Mascara ]
                int net1 = dIP1 & a;
                int net2 = dIP2 & b;
                int net3 = dIP3 & c;
                int net4 = dIP4 & d;

                // Mostrar a rede
                rede.setText(net1 + "." + net2 + "." + net3 + "." + net4);

                //Broadcast [ rede or (rede xor mascara) ]
                Integer bd1 = net1 | (255 ^ a);
                Integer bd2 = net2 | (255 ^ b);
                Integer bd3 = net3 | (255 ^ c);
                Integer bd4 = net4 | (255 ^ d);

                // Mostrar broadcast
                broadcast.setText(bd1 + "." + bd2 + "." + bd3 + "." + bd4);

                // Primeiro IP
                int pip = net4 + 1;
                primeiro.setText(net1 + "." + net2 + "." + net3 + "." + pip);
                // Ultimo IP
                int uip = bd4 - 1;
                ultimo.setText(bd1 + "." + bd2 + "." + bd3 + "." + uip);

            } catch (Exception e) {
                //exibirMensagem("Invalid IP entry!"); // Sem tratamento de erros
                //msg=false;
            } // Fim do try catch
        } //else if(msg==true){
           //exibirMensagem("Enter an IP to calculate!");
           //msg=false;
        //} // Fim do else if
    } // Fim função calcular

    private void exibirMensagem(String mensagem){
        Toast.makeText(getApplicationContext(),
                mensagem ,
                Toast.LENGTH_SHORT).show();
    }
}// End

