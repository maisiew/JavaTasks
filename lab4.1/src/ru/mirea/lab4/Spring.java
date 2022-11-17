package ru.mirea.lab4;

public enum Spring {
    ONE {
        public String toString() {
            return "Весна начинается 1 марта.";
        }
    },

    TWO {
        public String toString() {
            return "Весенние месяцы: март, апрель, май.";
        }
    },

    THREE {
        public String toString() {
            return "Температура воздуха весной в России в среднем +8°C.";
        }
    },

    FOUR {
        public String toString() {
            return "Cредняя минимальная температура составляет -5°C.";
        }
    },

    FIVE {
        public String toString() {
            return "Cредняя максимальная температура держится на отметке +17°C.";
        }
    },

    SIX {
        public String toString() {
            return "21 марта - весеннее равноденствие (кельтский праздник - Остара).";
        }
    },

    SEVEN {
        public String toString() {
            return "1 мая - День труда в России (кельтский праздник - Бельтайн). \n";
        }
    }
}
