using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Strings
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void caixatexto_Click(object sender, EventArgs e)
        {

        }

        private void cmd_executar_Click(object sender, EventArgs e)
        {
            //STRING

            string frase = "este tipo de variavel é alfa numerico";

            //caixa_texto.Text = frase + " (contem " + frase.Length + "letras )";

            //caixa_texto.Text = frase.ToUpper();

            caixa_texto.Text = frase.Substring(5);

            Console.WriteLine("ola word");

        }
    }
}
