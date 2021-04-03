CREATE SCHEMA IF NOT EXISTS solar
SET SCHEMA solar
CREATE TABLE IF NOT EXISTS generation_forecast (id INTEGER IDENTITY PRIMARY KEY, pv_estimate DOUBLE, pv_estimate10 DOUBLE, pv_estimate90 DOUBLE, period_end VARCHAR(50), period_end_epoch BIGINT, period VARCHAR(50))