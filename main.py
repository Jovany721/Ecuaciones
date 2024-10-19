import matplotlib.pyplot as plt

# Crear figura y ejes
fig, ax = plt.subplots()

# Establecer los límites del plano cartesiano
ax.set_xlim([-4, 4])
ax.set_ylim([-4, 4])

# Dibujar los ejes
ax.axhline(y=0, color='black', linewidth=1.5)  # Eje X
ax.axvline(x=0, color='black', linewidth=1.5)  # Eje Y

# Añadir líneas de cuadrícula
ax.grid(True, which='both')

# Etiquetas de los ejes
ax.set_xlabel('X', fontsize=12, color='red')
ax.set_ylabel('Y', fontsize=12, color='red')

# Etiquetas de cuadrantes


# Añadir marcas en los ejes
ax.set_xticks(range(-7, 7))
ax.set_yticks(range(-7, 7))

# Mostrar el gráfico
plt.title('Plano Cartesiano', fontsize=14)
plt.axhline(0, color='black', lw=1)
plt.axvline(0, color='black', lw=1)
plt.grid(color='gray', linestyle='--', linewidth=0.5)
plt.show()
