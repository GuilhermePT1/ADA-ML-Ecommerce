import java.time.LocalDateTime;

public class CupomDeDesconto {
        private String codigo;
        private double percentual;
        private LocalDateTime dataValidade;

        public CupomDeDesconto(String codigo, double percentual, LocalDateTime dataValidade) {
            this.codigo = codigo;
            this.percentual = percentual;
            this.dataValidade = dataValidade;
        }

        public String getCodigo() {
            return codigo;
        }

        public double getPercentual() {
            return percentual;
        }

        public LocalDateTime getDataValidade() {
            return dataValidade;
        }

        public boolean isValido() {
            return LocalDateTime.now().isBefore(dataValidade);
        }
    }