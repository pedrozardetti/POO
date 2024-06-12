package Strategy2;

import Interface.CalcularFrete;

public enum ListaEmpresas implements CalcularFrete {
    CBO {
        @Override
        public Double calcularFrete(double frete) {
            return frete * 0.4;
        }
    },
    XPTO {
        @Override
        public Double calcularFrete(double frete) {
            return frete * 0.6;
        }
    },
    ABC {
        @Override
        public Double calcularFrete(double frete) {
            return frete * 0.1;
        }
    },
    XQC {
        @Override
        public Double calcularFrete(double frete) {
            return frete * 2;
        }
    }

}
